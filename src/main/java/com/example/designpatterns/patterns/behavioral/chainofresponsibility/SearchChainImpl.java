package com.example.designpatterns.patterns.behavioral.chainofresponsibility;

import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demo IpSelectionChain
 *
 * @author Wolf-Liu
 * @date 2020/4/4 22:15
 */
public class SearchChainImpl implements SearchChain {
    private static final EnumMap<SearchType, Pattern> PATTERN_MAP = new EnumMap<>(SearchType.class);

    static {
        PATTERN_MAP.put(SearchType.IP, Pattern.compile("((2(5[0-5]|[0-4]\\d))|(1\\d{1,2})|([1-9]?\\d))(\\.((2(5[0-5]|[0-4]\\d))|(1\\d{1,2})|([1-9]?\\d))){3}"));
        PATTERN_MAP.put(SearchType.EMAIL, Pattern.compile("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}"));
        PATTERN_MAP.put(SearchType.DOMAIN, Pattern.compile("([a-zA-Z0-9]([a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}"));
    }

    private static final EnumMap<SearchType, String> SEARCH_STRATEGY_FACTORY = new EnumMap<>(SearchType.class);

    static {
        SEARCH_STRATEGY_FACTORY.put(SearchType.IP, "当前要搜索的字符串为 IP");
        SEARCH_STRATEGY_FACTORY.put(SearchType.EMAIL, "当前要搜索的字符串为 EMAIL");
        SEARCH_STRATEGY_FACTORY.put(SearchType.DOMAIN, "当前要搜索的字符串为 DOMAIN");
    }

    private static final EnumMap<SearchType, SearchChain> SEARCH_CHAIN_FACTORY = new EnumMap<>(SearchType.class);

    static {
        SEARCH_CHAIN_FACTORY.put(SearchType.IP, new SearchChainImpl(SearchType.IP));
        SEARCH_CHAIN_FACTORY.put(SearchType.EMAIL, new SearchChainImpl(SearchType.EMAIL));
        SEARCH_CHAIN_FACTORY.put(SearchType.DOMAIN, new SearchChainImpl(SearchType.DOMAIN));
    }

    private SearchType curr;

    public SearchChainImpl() {
        curr = SearchType.values()[0];
    }

    public SearchChainImpl(SearchType type) {
        this.curr = type;
    }

    /**
     * 预先处理字符串，不合要求不能进入该方法
     * <pre><code>
     *     if (searchText == null || "".equals(searchText)) {
     *        return null;
     *     }
     *     String trimText = searchText.trim();
     * </code></pre>
     *
     * @return 返回找到的字符串
     */
    @Override
    public String search(String trimText) {
        Matcher matcher = PATTERN_MAP.get(curr).matcher(trimText);
        String foundText;
        if (matcher.find()) {
            foundText = matcher.group();
            System.out.println(SEARCH_STRATEGY_FACTORY.get(curr));
        } else {
            SearchType[] values = SearchType.values();
            int nextIdx = curr.ordinal() + 1;
            if (nextIdx == values.length) {
                return null;
            }
            SearchType next = values[nextIdx];
            foundText = SEARCH_CHAIN_FACTORY.get(next).search(trimText);
        }
        return foundText;
    }
}

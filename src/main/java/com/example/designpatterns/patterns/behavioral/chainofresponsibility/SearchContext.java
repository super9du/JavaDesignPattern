package com.example.designpatterns.patterns.behavioral.chainofresponsibility;

/**
 * Demo Context
 *
 * @author Wolf-Liu
 * @date 2020/4/4 22:09
 */
public class SearchContext {
    public void search(String searchText) {
        SearchChain searchChain = new SearchChainImpl();
        if (searchText == null || "".equals(searchText)) {
            return;
        }
        String trimText = searchText.trim();
        String found = searchChain.search(trimText);
        System.out.println("找到：" + found);
    }
}

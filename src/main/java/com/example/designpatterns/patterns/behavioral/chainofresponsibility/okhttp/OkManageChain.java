package com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demo OkManageChain
 *
 * @author Wolf-Liu
 * @date 2020/4/6 10:49
 */
public class OkManageChain implements OkSearchChain {
    List<OkSearchChain> chains = new ArrayList<>();
    int idx;
    String found = null;

    @Override
    public String search(String searchText, OkSearchChain c) {
        if (idx == 0) {
            found = null;
        }
        if (idx < chains.size()) {
            OkSearchChain chain = chains.get(idx);
            idx++;
            found = chain.search(searchText, this);
        }
        idx = 0;
        return found;
    }

    public OkManageChain add(OkSearchChain chain) {
        chains.add(chain);
        return this;
    }
}

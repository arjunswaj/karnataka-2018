package com.asb.elections;

import com.google.common.collect.ImmutableMap;
import fj.data.IOFunctions;

import java.util.Map;

public class Main {

    private static final Map<String, Integer> STATE_SEATS_MAP =
            ImmutableMap.<String, Integer>builder()
                    .put("S10", 224)
                    .build();

    public static void main(String[] args) {
        Scraper scraper = new Scraper();
        IOFunctions.runSafe(scraper.f(STATE_SEATS_MAP));
    }
}

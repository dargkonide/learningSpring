package com.test;

import org.springframework.stereotype.Component;

@Component
class WorldHistory implements Histories {

    @Override
    public String toString() {
        return "Log-log time ago...";
    }
}

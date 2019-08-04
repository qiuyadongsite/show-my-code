package com.qyd.learn.show.pattern.delegate.simple;

/**
 * qyd.
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}


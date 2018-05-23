/*
 * Created by Matt Stefanski on 5/19/18 1:01 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 12:45 PM
 */

package com.kodilla.patterns.strategy.social.tools;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Sharing by Snapchat";
    }

}

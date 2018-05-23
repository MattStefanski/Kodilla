/*
 * Created by Matt Stefanski on 5/19/18 1:02 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 1:02 PM
 */

package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.tools.FacebookPublisher;
import com.kodilla.patterns.strategy.social.tools.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.tools.TwitterPublisher;
import com.kodilla.patterns.strategy.social.user.Millenials;
import com.kodilla.patterns.strategy.social.user.User;
import com.kodilla.patterns.strategy.social.user.YGeneration;
import com.kodilla.patterns.strategy.social.user.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {


    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("user1");
        User zGeneration = new ZGeneration("user2");
        User yGeneration = new YGeneration("user3");
        //When
        String millenialSharing = millenials.sharePost();
        String zGenerationSharing = zGeneration.sharePost();
        String yGenerationSharing = yGeneration.sharePost();
        //Then
        Assert.assertEquals("Sharing by Twitter", millenialSharing);
        Assert.assertEquals("Sharing by Facebook", yGenerationSharing);
        Assert.assertEquals("Sharing by Snapchat", zGenerationSharing);
    }


    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("user1");
        User zGeneration = new ZGeneration("user2");
        User yGeneration = new YGeneration("user3");

        //When
        millenials.setSharingChannel(new FacebookPublisher());
        zGeneration.setSharingChannel(new TwitterPublisher());
        yGeneration.setSharingChannel(new SnapchatPublisher());
        String millenialSharing = millenials.sharePost();
        String zGenerationSharing = zGeneration.sharePost();
        String yGenerationSharing = yGeneration.sharePost();
        //Then
        Assert.assertEquals("Sharing by Facebook", millenialSharing);
        Assert.assertEquals("Sharing by Snapchat", yGenerationSharing);
        Assert.assertEquals("Sharing by Twitter", zGenerationSharing);
    }
}

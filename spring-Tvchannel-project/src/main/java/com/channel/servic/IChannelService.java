package com.channel.servic;

import com.channel.model.Chaneel;

public interface IChannelService {
	
	void addChannel(Chaneel channel);
	void updateChannel(Chaneel channel);
	void deleteChannel(int channelId);

}

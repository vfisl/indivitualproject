package com.channel.servic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.channel.Repository.IChannelRepository;
import com.channel.model.Chaneel;

@Service
public class ChannelServicImpl implements IChannelService {

	IChannelRepository iChannelRepository;

	@Autowired
	public void setiChannelRepository(IChannelRepository iChannelRepository) {
		this.iChannelRepository = iChannelRepository;
	}

	@Override
	public void updateChannel(Chaneel channel) {
		iChannelRepository.save(channel);
	}

	@Override
	public void deleteChannel(int channelId) {
		iChannelRepository.deleteById(channelId);
	}

	@Override
	public void addChannel(Chaneel channel) {
		iChannelRepository.save(channel);
	}

}

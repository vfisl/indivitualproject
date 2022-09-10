package com.channel.servic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.channel.Repository.IShowRepository;
import com.channel.model.Show;

@Service
public class ShowServicImpl implements IShowServic {

	IShowRepository iShowRepository;

	@Autowired
	public void setiShowRepository(IShowRepository iShowRepository) {
		this.iShowRepository = iShowRepository;
	}

	@Override
	public void updateShow(Show show) {
		iShowRepository.save(show);
	}

	@Override
	public void deleteShow(int showId) {
		iShowRepository.deleteById(showId);
	}

	@Override
	public void addShow(Show show) {
		iShowRepository.save(show);
	}

}

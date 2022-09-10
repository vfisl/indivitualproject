package com.channel.servic;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.channel.Repository.IDetailsRepository;
import com.channel.model.Details;


@Service
public class DetailsServiceImpl implements IDetailsService {
	
	IDetailsRepository iDetailsRepository;
     
	@Autowired
	public void setiDetailsRepository(IDetailsRepository iDetailsRepository) {
		this.iDetailsRepository = iDetailsRepository;
	}

	

	@Override
	public void updateDetails(Details details) {
		iDetailsRepository.save(details);
	}

	@Override
	public void deleteDetails(int detailsId) {
		iDetailsRepository.deleteById(detailsId);
	}



	@Override
	public void addDetails(Details details) {
		iDetailsRepository.save(details);
	}

}

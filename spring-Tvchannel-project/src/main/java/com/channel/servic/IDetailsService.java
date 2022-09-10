package com.channel.servic;
import com.channel.model.Details;

public interface IDetailsService {
	
	void addDetails(Details details);
	void updateDetails(Details details);
	void deleteDetails(int detailsId);

}

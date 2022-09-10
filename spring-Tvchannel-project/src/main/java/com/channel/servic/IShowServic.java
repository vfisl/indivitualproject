package com.channel.servic;

import com.channel.model.Show;

public interface IShowServic {

	void addShow(Show show);
	void updateShow(Show show);
	void deleteShow(int showId);

}

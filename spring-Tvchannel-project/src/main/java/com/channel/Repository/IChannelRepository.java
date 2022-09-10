package com.channel.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.channel.model.Chaneel;

@Repository
public interface IChannelRepository  extends JpaRepository<Chaneel, Integer>{

}

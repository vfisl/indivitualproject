package com.channel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.channel.model.Show;
@Repository
public interface IShowRepository extends JpaRepository<Show, Integer> {

}

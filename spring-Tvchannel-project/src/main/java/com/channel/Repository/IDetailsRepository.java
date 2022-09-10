package com.channel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.channel.model.Details;
@Repository
public interface IDetailsRepository extends  JpaRepository<Details, Integer> {

}

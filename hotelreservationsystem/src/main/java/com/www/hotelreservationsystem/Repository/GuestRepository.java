package com.www.hotelreservationsystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.www.hotelreservationsystem.Entity.Guest;

public interface GuestRepository extends JpaRepository<Guest,Long> {


	List<Guest> findGuestByFirstname(String firstname);

	List<Guest> findGuestByLastname(String lastname);

	List<Guest> findGuestByPassword(String password);

	List<Guest> findGuestId(String id);

	List<Guest> findGuestByFirstNameAndLastName(String firstName, String lastName);

	List<Guest> findGuestByFirstNameOrLastName(String firstName, String lastName);

	List<Guest> findGuestById(List<Long> id);

	List<Guest> findGuestById(String id);

	
	
}




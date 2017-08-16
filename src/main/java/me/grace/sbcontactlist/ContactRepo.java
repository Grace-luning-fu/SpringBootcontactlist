package me.grace.sbcontactlist;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepo extends CrudRepository<Contact, Long>
{

}

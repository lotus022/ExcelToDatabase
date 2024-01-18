package com.kb.group.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kb.group.entity.User;


public interface InvoiceRepository extends JpaRepository<User, Long> {

}
package com.pharmacy.Management.repository;

import com.pharmacy.Management.models.MailResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailResponseRepository extends JpaRepository<MailResponse, Long> {
}

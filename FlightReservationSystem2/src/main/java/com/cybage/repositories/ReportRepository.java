package com.cybage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cybage.model.Report;


@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{

}

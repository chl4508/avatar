package com.cys.avatar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cys.avatar.domain.TusFile;

public interface TusRepository extends JpaRepository<TusFile, String> {
}

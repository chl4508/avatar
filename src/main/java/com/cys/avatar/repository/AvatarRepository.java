package com.cys.avatar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cys.avatar.domain.Resource;

@Repository
public interface AvatarRepository extends JpaRepository<Resource, String> {
}

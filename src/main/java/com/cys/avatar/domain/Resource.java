package com.cys.avatar.domain;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "resource")
public class Resource {

	@Id
	private String id;

	@Column(name = "original_file_name")
	private String originalFileName;

	@Column(name = "new_file_name")
	private String newFileName;

	@Column(name = "file_path")
	private String filePath;

	@Column(name = "started_at")
	private Instant startedAt;


	@Builder
	public Resource(String id, String originalFileName, String newFileName, String filePath) {
		this.id = id;
		this.originalFileName = originalFileName;
		this.newFileName = newFileName;
		this.filePath = filePath;
		this.startedAt = Instant.now();
	}
}

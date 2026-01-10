package com.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "org.emp")
@Data
public class EmpInfo {

private	String name;
private Integer id;

@Value("${os.name}")
private String osname;

@Value("${Path}")
private String path;

}

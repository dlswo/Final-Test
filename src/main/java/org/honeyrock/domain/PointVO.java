package org.honeyrock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class PointVO {
	
	private Integer pno;
	private double lat, lng, time;
	private String title, desc, keyword, img, addpoint, thumb;
	private int cost, good, bad;
	private Character category;
	private Date regdate, updatedate;

}

package com.claiborne.kafkarealdemo.entiity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="wikimedia_change")
@Getter
@Setter
public class WikiMediaData {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Lob
  private String wikiEventData;

}

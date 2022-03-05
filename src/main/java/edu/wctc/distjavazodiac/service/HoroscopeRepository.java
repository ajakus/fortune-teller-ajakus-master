package edu.wctc.distjavazodiac.service;

import edu.wctc.distjavazodiac.entity.Horoscope;
import org.springframework.data.repository.CrudRepository;

public interface HoroscopeRepository extends CrudRepository<Horoscope, Integer> {
}

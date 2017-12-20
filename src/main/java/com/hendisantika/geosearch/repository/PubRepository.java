package com.hendisantika.geosearch.repository;

import com.hendisantika.geosearch.domain.Pub;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : geo-search
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/12/17
 * Time: 07.35
 * To change this template use File | Settings | File Templates.
 */
public interface PubRepository extends MongoRepository<Pub, String> {
    Pub findByName(String name);

    List<Pub> findByRatingGreaterThan(int rating);

    List<Pub> findByRatingLessThan(int rating);

    GeoResults<Pub> findByLocationNear(Point location, Distance distance);
}

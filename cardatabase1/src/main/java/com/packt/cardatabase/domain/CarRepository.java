package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
//    // 브랜드로 자동차 검색
//    List<Car> findByBrand(String brand);
//    // 인터페이스이기 때문에 접근지정자/구현부가 없음
//
//    // 색상으로 자동차 검색
//    List<Car> findByColor(String color);
//
//    // 자동차 생산년도를 통해 자동차를 검색한다면 어떻게 추상 메서드를 만들 수 있을까요
//    List<Car> findByModelYear(int modelYear);
//
//    // 브랜드와 모델로 자동차를 검색
//    List<Car> findByBrandAndModel(String brand, String model);
//
//    // 브랜드 또는 색상별로 자동차 가져오기
//    List<Car> findByBrandOrColor(String brand, String color);
//
//    // 브랜드로 자동차를 검색하고 연도로 정렬
//    List<Car> findByBrandOrderByModelYearAsc(String brand);
//
//    // SQL문을 이용하여 브랜드로 자동차를 검색(근데 LIKE 사용하는 예시)
//    @Query("select c from Car c where c.brand like %1")
//    List<Car> findByBrandEndsWith(String brand);
}

package com.springboot.jpa.repository;


import com.springboot.jpa.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
    /*
    * Spring Data JPA 는 JpaRepository 를 기반으로 더욱 쉽게 데이터베이스를 사용할 수 있는 아키텍쳐를 제공.
    * 리포지토리를 생성할때에는, 접근하려는 테이블과 매핑되는 엔티티에 대한 인터페이스를 생성하고
    * JpaRepository 를 상속받으면 된다. 이때, 대상 엔티티와 기본값 타입을 지정해 주어야 한다.
    *
    *
    * ### 쿼리 메서드의 주제 키워드

- find…By

Optional<T> findByNumber(Long number)

- exists…By: 특정 데이터가 존재하는지 확인

boolean existsBuNumber(Long number)

- count…By: 조회 쿼리를 수행한 후 쿼리 결과로 나온 레코드의 개수를 리턴

long countByName(String name)

- delete…By: 삭제 쿼리를 수행

void deleteByNumber(Long number)

- First<number>:  쿼리를 통해 조회된 결과값으 개수를 제한하는 키워드

List<Product> findFirst5ByName(String name)

### 쿼리 메서드의 조건자 키워드

- is(not): 값의 일치를 조건으로 사용하는 키워드

Product findByNumberIs(Long number)

- Null,NotNull: 값이 null 인지 검사하는 키워드

List<Product> findByUpdatedAtNull(Long number)

- True,False: boolean 타입으로 지정된 칼럼값을 확인하는 키워드

Product findByisActiveTrue();

- And,Or: 여러 조건을 묶을때 사용

Product findByNumberAndName(Long number, String name)

- GreaterThan,LessThan,Between

List<Product> findByPriceGreaterThan(Long price)

- StartingWith,EndingWith,Containing,Like: 칼럼 값에서 일부 일치 여부를 확인하는 키워드

List<Product> findByNameLike(String name)
    * */

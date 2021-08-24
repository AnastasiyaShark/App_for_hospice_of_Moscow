package ru.iteco.fmh.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.iteco.fmh.model.task.claim.Claim;
import ru.iteco.fmh.model.task.StatusE;

import java.util.Collection;
import java.util.List;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

    List<Claim> findAllByStatusInAndDeletedIsFalseOrderByPlanExecuteDateAscCreateDateAsc(Collection<StatusE> status);
    List<Claim> findAllByDeletedIsFalseOrderByPlanExecuteDateAscCreateDateAsc();
    Claim findClaimById (int id);




}

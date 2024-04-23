package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Abonnement;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.repositories.AbonnementRepository;
import tn.esprit.com.repositories.SkieurRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class AbonnementServiceImpl implements IAbonnementService{
    AbonnementRepository abonnementRepository;
    SkieurRepository sk;
    @Override
    public Abonnement addAbonnement(Abonnement abn) {
        return abonnementRepository.save(abn);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abn) {
        return abonnementRepository.save(abn);
    }

    @Override
    public Abonnement updateAbonnementByID(Abonnement abn) {
            return abonnementRepository.save(abn);
    }

    @Override
    public void removeAbonnement(Abonnement abn) {
        abonnementRepository.delete(abn);
    }

    @Override
    public void removeAbonnementById(Integer abn) {
    abonnementRepository.deleteById((long)abn);
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbn) {
        return abonnementRepository.findById((long)idAbn).get();
    }

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }


    public List<Abonnement> retrieveAbonnementExpiresInSevenDays(LocalDate date){
        return  abonnementRepository.findByDateFin(date);
    }
    @Scheduled(fixedRate = 1000)
    public  void alertExpiresInSevenDays(){
        List<Abonnement> list = retrieveAbonnementExpiresInSevenDays(LocalDate.now().plusDays(7));
        System.out.println(list.get(0));
        for (Abonnement abn : list){
            Skieur skieur = sk.findByAbonnement(abn);
            log.info(abn.getTypeAbonnement().toString()+"  working 1 item found   "+skieur.getNomS());
            }
        }

    }


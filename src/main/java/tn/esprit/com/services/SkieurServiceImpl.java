package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.repositories.SkieurRepository;

@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService {
    SkieurRepository skieurRepository;
}

package org.youcode.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.youcode.domain.Membre;
import org.youcode.exception.MembreNotFoundException;
import org.youcode.exception.MembreValidationException;
import org.youcode.repository.MembreRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MembreServiceImp implements MembreService {

    @Autowired
    private MembreRepository membreRepository;



    @Override
    public List<Membre> findAll() {
        return membreRepository.findAll();
    }


    @Override
    public Optional<Membre> findById(UUID id) {
        Optional<Membre> membre = membreRepository.findById(id);
        if (membre.isEmpty()) {
            throw new MembreNotFoundException(id);
        }
        return membre;
    }


    @Transactional
    @Override
    public Membre save(Membre membre) {
        validateMembre(membre);
        return membreRepository.save(membre);
    }



    @Override
    public void validateMembre(Membre membre) {
        if (membre.getMembershipNumber() == null || membre.getMembershipNumber().isEmpty()) {
            throw new MembreValidationException("Membership number is required.");
        }

        if (membre.getFirstName() == null || membre.getFirstName().isEmpty()) {
            throw new MembreValidationException("First name is required.");
        }

        if (membre.getLastName() == null || membre.getLastName().isEmpty()) {
            throw new MembreValidationException("Last name is required.");
        }

        if (membre.getIdDocument() == null || membre.getIdDocument().isEmpty()) {
            throw new MembreValidationException("ID document is required.");
        }

        if (membre.getNationality() == null || membre.getNationality().isEmpty()) {
            throw new MembreValidationException("Nationality is required.");
        }

        if (membre.getMembershipDate() == null) {
            throw new MembreValidationException("Membership date is required.");
        }

        if (membre.getLicenseExpiryDate() == null) {
            throw new MembreValidationException("License expiry date is required.");
        }

        if (membre.getLicenseExpiryDate().isBefore(membre.getMembershipDate())) {
            throw new MembreValidationException("License expiry date must be after membership date.");
        }

    }



}


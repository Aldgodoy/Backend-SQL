/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldanagodoyportfolio.aeg.Security.Service;

import com.aldanagodoyportfolio.aeg.Security.Entity.Rol;
import com.aldanagodoyportfolio.aeg.Security.Enums.RolNombre;
import com.aldanagodoyportfolio.aeg.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional // trata de mantener lo que tengo acá con la base de datos caso por ej se caiga el sistema, hace un rollback(persistencia)
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return irolRepository.findByRolNombre(rolNombre);
    
    }
    public void save (Rol rol){
    irolRepository.save(rol);
    }
}

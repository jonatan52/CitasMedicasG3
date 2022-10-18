
package com.backend.citas.Service.Implement;

import com.backend.citas.Dao.CopagoDao;
import com.backend.citas.Models.Copago;
import com.backend.citas.Service.CopagoService;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class CopagoServiceImpl implements CopagoService {
    @Autowired
    private CopagoDao copagoDao;



   @Override
    @Transactional(readOnly=false)
    public Copago save(Copago copago) {
        return copagoDao.save(copago);
    }



   @Override
    @Transactional(readOnly=false)
    public void delete(Integer id) {
        copagoDao.deleteById(id);
    }



   @Override
    @Transactional(readOnly=true)
    public Copago findById(Integer id) {
        return copagoDao.findById(id).orElse(null);
    }



   @Override
    @Transactional(readOnly=true)
    public List<Copago> findByAll() {
        return (List<Copago>) copagoDao.findAll();
    }
}


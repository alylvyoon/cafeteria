package fca.cafeteria.domain;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.repository.BebidaRepository;
import fca.cafeteria.repository.TipoBebidaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CatalogoService {

    private final BebidaRepository bebidaRepository;
    private final TipoBebidaRepository tipoBebidaRepository;

    public CatalogoService(BebidaRepository bebidaRepository, TipoBebidaRepository tipoBebidaRepository) {
        this.bebidaRepository = bebidaRepository;
        this.tipoBebidaRepository = tipoBebidaRepository;
    }

    public Bebida registrarBebida(Bebida bebida, TipoBebida tipoBebida) {
        Optional<TipoBebida> tipoExistente = tipoBebidaRepository.findByDescripcion(tipoBebida.getDescripcion());

        if (tipoExistente.isPresent()) {
            bebida.setTipoBebida(tipoExistente.get());
        } else {
            TipoBebida nuevoTipo = tipoBebidaRepository.save(tipoBebida);
            bebida.setTipoBebida(nuevoTipo);
        }
        return bebidaRepository.save(bebida);
    }
}
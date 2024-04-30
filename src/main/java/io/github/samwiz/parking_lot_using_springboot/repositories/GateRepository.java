package io.github.samwiz.parking_lot_using_springboot.repositories;

import io.github.samwiz.parking_lot_using_springboot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(Long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}

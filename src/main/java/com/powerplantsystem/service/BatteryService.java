package com.powerplantsystem.service;

import java.util.List;

import javax.validation.Valid;

import com.powerplantsystem.Dto.BatteryDTO;
import com.powerplantsystem.Dto.BatteryEntityDTO;
import com.powerplantsystem.entity.BatteryEntity;

public interface BatteryService {

	Iterable<BatteryEntity> save(@Valid List<BatteryEntityDTO> batteries);

	BatteryDTO getByPostCode(String postcode);

}

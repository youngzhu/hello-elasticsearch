package com.youngzy.es.hotel.service.impl;

import com.youngzy.es.hotel.mapper.HotelMapper;
import com.youngzy.es.hotel.pojo.Hotel;
import com.youngzy.es.hotel.service.IHotelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
}

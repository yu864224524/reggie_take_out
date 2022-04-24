package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.ShoppingCart;
import com.itheima.reggie.mapper.ShoppingCartMapper;
import com.itheima.reggie.service.ShoppingCartServcie;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServcieImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartServcie {
}

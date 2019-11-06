package com.cloudalibaba.commons.domain;

import tk.mybatis.mapper.genid.GenId;

import java.util.UUID;

/**
 * description: uuid 唯一主键 生成
 *
 * @author MagicHat
 */
public class UUIdGenId implements GenId<String> {

    @Override
    public String genId(String s, String s1) {
        return UUID.randomUUID().toString().replace("-","");
    }

}

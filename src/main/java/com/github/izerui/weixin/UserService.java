/**
 *          你他妈的想干嘛就干嘛公共许可证
 *               第二版，2004年12月
 *
 * 版权所有(C) 2004 serv<liuyuhua69@gmail.com>
 *
 * 任何人都有复制与发布本协议的原始或修改过的版本的权利。
 * 若本协议被修改，须修改协议名称。
 *
 *          你他妈的想干嘛就干嘛公共许可证
 *              复制、发布和修改条款
 *
 *  0. 你只要他妈的想干嘛就干嘛好了。
 */
package com.github.izerui.weixin;

import com.github.izerui.weixin.mappings.*;

/**
 * Created by serv on 16/4/21.
 */
public interface UserService {

    Users getUsers(String nextOpenId);

    Integer getGroup(String openId);

    Status move(OneUser oneUser);

    Status move(ArrayUser arrayUser);

    Status updateRemark(UserRemark userRemark);

    UserInfo userInfo(String openId);

}

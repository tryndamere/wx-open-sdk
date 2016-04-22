/**
 *          你他妈的想干嘛就干嘛公共许可证
 *               第二版，2004年12月
 *
 * 版权所有(C) 2004 桑·奥塞瓦<sam@hocevar.net>
 *
 * 任何人都有复制与发布本协议的原始或修改过的版本的权利。
 * 若本协议被修改，须修改协议名称。
 *
 *          你他妈的想干嘛就干嘛公共许可证
 *              复制、发布和修改条款
 *
 *  0. 你只要他妈的想干嘛就干嘛好了。
 */
package com.github.izerui.weixin.impl;

import com.github.izerui.weixin.MessageService;
import com.github.izerui.weixin.api.MessageApi;
import com.github.izerui.weixin.mappings.Message;
import com.github.izerui.weixin.mappings.Status;
import retrofit2.Retrofit;

/**
 * Created by serv on 16/4/21.
 */
public class MessageServiceImpl extends ServiceImpl<MessageApi> implements MessageService {

    public MessageServiceImpl(Retrofit retrofit) {
        super(retrofit);
    }

    @Override
    protected Class<MessageApi> getApiClass() {
        return MessageApi.class;
    }

    @Override
    public Status send(Message message) {
        return execute(api().send(message,accessToken));
    }
}

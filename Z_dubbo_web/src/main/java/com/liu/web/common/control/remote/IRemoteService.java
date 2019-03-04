package com.liu.web.common.control.remote;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;

/**
 *
 */
public interface IRemoteService {
    void execute(InputDTO inputDTO, OutputDTO outputDTO);
}

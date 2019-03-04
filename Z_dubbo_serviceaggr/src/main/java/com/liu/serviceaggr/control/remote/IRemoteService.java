package com.liu.serviceaggr.control.remote;

import com.liu.apidubbo.InputDTO;
import com.liu.apidubbo.OutputDTO;

/**
 *
 */
public interface IRemoteService {
    void execute(InputDTO inputDTO, OutputDTO outputDTO);
}

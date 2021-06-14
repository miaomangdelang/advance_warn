package com.advance_warn.model.output;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 事件分页列表回参
 *
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2021/06/11 09:18
 */
@Data
@ApiModel(description = "事件分页列表回参")
public class RealtimeEventBranchPageResponse extends PageResponse<RealtimeEventBranchPageDetailResponse> {

	private static final long serialVersionUID = -1102450989056849539L;

}

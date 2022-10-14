package com.swp.hr_backend.service;

import com.swp.hr_backend.exception.custom.CustomBadRequestException;
import com.swp.hr_backend.exception.custom.CustomNotFoundException;
import com.swp.hr_backend.exception.custom.CustomUnauthorizedException;
import com.swp.hr_backend.model.request.CreateScheduleRequest;
import com.swp.hr_backend.model.request.UpdateScheduleRequest;
import com.swp.hr_backend.model.response.ScheduleDetailResponse;

import java.util.List;

public interface ScheduleService {

    List<ScheduleDetailResponse> getSchedule() throws CustomUnauthorizedException, CustomNotFoundException;
    ScheduleDetailResponse createSchedule(CreateScheduleRequest createScheduleRequest) throws CustomUnauthorizedException, CustomBadRequestException;
    ScheduleDetailResponse updateSchedule(UpdateScheduleRequest updateScheduleRequest) throws CustomUnauthorizedException, CustomBadRequestException;

}
package com.bortni.web.commands;

import com.bortni.exceptions.ReadException;
import com.bortni.service.CruiseService;
import com.bortni.util.Routes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class OurCruisesCommand implements Command {
    private CruiseService cruiseService;

    public OurCruisesCommand(CruiseService cruiseService) {
        this.cruiseService = cruiseService;
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List cruises = null;
        try {
            cruises = cruiseService.getCruisesWithShip();
        } catch (ReadException e) {
            request.getRequestDispatcher("/jsp/404error.jsp").forward(request, response);
        }
        request.setAttribute("cruises", cruises);
        request.getRequestDispatcher(Routes.OUR_CRUISES.getRoute()).forward(request, response);
    }
}

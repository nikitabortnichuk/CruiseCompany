package com.bortni.web.commands;

import com.bortni.exceptions.ReadException;
import com.bortni.service.ShipService;
import com.bortni.util.Routes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class OurShipsCommand implements Command{

    private ShipService shipService;

    public OurShipsCommand(ShipService shipService) {
        this.shipService = shipService;
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List shipList = null;
        try {
            shipList = shipService.getAllShips();
        } catch (ReadException e) {
            request.getRequestDispatcher("/jsp/404error.jsp").forward(request, response);
        }

        request.setAttribute("shipList", shipList);

        request.getRequestDispatcher(Routes.OUR_SHIPS.getRoute()).forward(request, response);
    }
}

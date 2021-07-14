/* global jQuery3, run, Muuri, JSONTree */
(function ($) {

    run.getConfiguration(function(config) {
        initDashboard(config.responseJSON);
    });

})(jQuery3);
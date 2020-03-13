package gl51.service

import gl51.data.IP

/**
 * Ceci convertit des IP en string
 */
interface IPConverterService {

    /**
     * Convertit une ip en string
     * @param ip entier
     * @return String
     */
    String getAndConvertIP(IP ip)
}

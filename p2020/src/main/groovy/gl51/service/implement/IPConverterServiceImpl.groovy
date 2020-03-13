package gl51.service.implement

import gl51.data.IP
import gl51.service.IPService

import javax.inject.Inject

class IPConverterServiceImpl implements gl51.service.IPConverterService {

    @Inject
    IPService ipService

    @Override
    String getAndConvertIP(IP ip) {
        //IP ip = service.fetchIp()
    }
}

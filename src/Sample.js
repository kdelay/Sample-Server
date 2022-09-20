import React, { useState, useEffect } from 'react';
import Axios from 'axios';

const Sample = () => {
    const [user, setUser] = useState([]);

    useEffect(() => {
        Axios.get("/api/list").then((response) => {
            console.log(response.data)
            // 리스폰 되는 값이 json을 포함한 모든 정보가 들어오기 때문에 필요한 값인 data만 가져온다.
            setUser(response.data)
        })
    }, []);


    return (
        <div>
            <table>
                <tbody>
                    <tr>
                        <td>아이디</td>
                        <td>이름</td>
                        <td>직급</td>
                    </tr>
                    {
                        user.map((data) => (
                            <tr className='content' key={data.empno}>
                                <td>{data.empno}</td>
                                <td>{data.ename}</td>
                                <td>{data.job}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
};

export default Sample;